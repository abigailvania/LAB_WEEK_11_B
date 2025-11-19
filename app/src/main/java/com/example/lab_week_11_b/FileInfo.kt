package com.example.lab_week_11_b

import java.io.File
import android.net.Uri

data class FileInfo(
    val uri: Uri,
    val file: File,
    val name: String,
    val relativePath: String,
    val mimeType: String
)