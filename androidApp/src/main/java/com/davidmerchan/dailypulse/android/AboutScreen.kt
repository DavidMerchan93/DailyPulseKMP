package com.davidmerchan.dailypulse.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davidmerchan.dailypulse.Platform

@Composable
fun AboutScreen() {
    Column {
        TopBar()
        AboutContent()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = "AboutScreen") },
    )
}

@Composable
fun AboutContent() {
    val data = makeItems()
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(data) { item ->
            AboutRow(title = item.first, content = item.second)
        }
    }
}

@Composable
fun AboutRow(title: String, content: String) {
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = title)
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = content)
        Spacer(modifier = Modifier.padding(4.dp))
        Divider()
    }
}

private fun makeItems(): List<Pair<String, String>> {
    val platform = Platform()
    platform.logPlatformInfo()

    return listOf(
        Pair("OS", platform.osName),
        Pair("OS Version", platform.osVersion),
        Pair("Device Model", platform.deviceModel),
        Pair("Density", platform.density.toString()),
        Pair("App Version", platform.appVersion),
    )
}

@Preview
@Composable
fun AboutPrev() {
    AboutScreen()
}