package com.example.template.models

import com.example.template.constants.Constants
import java.io.Serializable

data class GeneraResponse(

    val data        :Any? = Any(),
    val status      :String? = Constants.STRING_EMPTY,
    val operation   :String? = Constants.STRING_EMPTY,
    val message     :String? = Constants.STRING_EMPTY

): Serializable