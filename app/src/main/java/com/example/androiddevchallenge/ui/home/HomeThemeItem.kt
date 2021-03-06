/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.GardenModel
import com.example.androiddevchallenge.ui.components.BloomImage

@Composable
fun HomeThemeItem(itemContent: GardenModel) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .fillMaxWidth()
            .height(64.dp)
    ) {
        Surface(shape = MaterialTheme.shapes.small) {
            BloomImage(
                imageRes = itemContent.imageRes,
                modifier = Modifier
                    .height(64.dp)
                    .width(64.dp)
            )
        }

        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxHeight()
                .weight(1f)
        ) {
            Text(
                text = itemContent.name,
                modifier = Modifier.paddingFromBaseline(top = 24.dp),
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "This is a description",
                modifier = Modifier.paddingFromBaseline(top = 16.dp),
                style = MaterialTheme.typography.body1
            )
        }

        var checked: Boolean by rememberSaveable { mutableStateOf(false) }
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it },
            modifier = Modifier
                .padding(top = 16.dp)
                .size(24.dp)
        )
    }
    Divider(
        color = MaterialTheme.colors.secondary,
        modifier = Modifier.padding(start = 96.dp, end = 16.dp)
    )
}
