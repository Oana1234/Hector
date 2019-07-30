package com.example.hector.api

import com.example.hector.R
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

class RetrofitException(

    message: String?,
    url: String?,
    private val response: Response<*>?,
    kind: Kind,
    exception: Throwable?,
    private val retrofit: Retrofit?
) : RuntimeException(message, exception) {
    companion object {
        fun httpError(url: String, response: Response<*>, retrofit: Retrofit): RetrofitException {
            val message = response.code().toString() + " " + response.message()
            return RetrofitException(message, url, response, Kind.HTTP, null, retrofit)
        }

        fun networkError(exception: IOException) =
            RetrofitException(exception.message, null, null, Kind.NETWORK, exception, null)

        fun unexpectedError(exception: Throwable) =
            RetrofitException(exception.message, null, null, Kind.UNEXPECTED, exception, null)
    }

    /**
     * HTTP mResponse body converted to specified `type`. `null` if there is no
     * mResponse.
     *
     * @throws IOException if unable to convert the body to the specified `type`.
     */
    @Throws(IOException::class)
    fun <T> getErrorBodyAs(type: Class<T>): T? {
        val converter = retrofit?.responseBodyConverter<T>(type, arrayOfNulls(0))
        return response?.errorBody()?.let { converter?.convert(it) }
    }

    /**
     * Identifies the event mKind which triggered a [RetrofitException].
     */
    enum class Kind(val errorMessage: Int?) {
        NETWORK(R.string.network_error_connection),
        HTTP(R.string.network_error_server),
        UNEXPECTED(R.string.network_error_unexpected)
    }
}
