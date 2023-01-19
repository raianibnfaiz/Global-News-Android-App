package com.raian.newsappproject.converter

import androidx.room.TypeConverter
import com.raian.newsappproject.models.Source

class NewsConverter {

    @TypeConverter
    fun toSource(source: Source): String? {
        if(source != null){
            return "${source.id}=${source.name}"
        }
        return null
    }

    @TypeConverter
    fun fromString(output: String): Source? {
        if(output!= null){
            val value = output.split("=")
            return Source(value[0],value[1])
        }
        return null
    }

}