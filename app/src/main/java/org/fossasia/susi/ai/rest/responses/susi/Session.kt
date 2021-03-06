package org.fossasia.susi.ai.rest.responses.susi

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * <h1>Kotlin Data class to parse session object in retrofit response from susi client.</h1>
 */

data class Session (

    val identity: Identity? = null

)
