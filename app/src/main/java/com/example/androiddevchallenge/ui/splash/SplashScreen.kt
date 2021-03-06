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
package com.example.androiddevchallenge.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.BloomImage
import dev.chrisbanes.accompanist.insets.navigationBarsPadding

@Composable
fun SplashScreen(navigateToAccount: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding()
            .background(MaterialTheme.colors.primary)
    ) {
        BloomImage(
            imageRes = R.drawable.ic_welcome_bg,
            modifier = Modifier.fillMaxWidth(),
            scale = ContentScale.FillWidth
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 72.dp)
        ) {
            val centerAlignment = Modifier.align(Alignment.CenterHorizontally)
            BloomImage(
                imageRes = R.drawable.ic_welcome_illos,
                modifier = Modifier
                    .wrapContentSize()
                    .offset(x = 88.dp)
            )
            Spacer(modifier = Modifier.height(48.dp))

            BloomImage(
                imageRes = R.drawable.ic_logo,
                modifier = Modifier
                    .wrapContentSize()
                    .then(centerAlignment)
            )

            Text(
                text = stringResource(id = R.string.app_description),
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier
                    .paddingFromBaseline(top = 24.dp)
                    .then(centerAlignment)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .height(48.dp)
                    .fillMaxWidth(),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                ),
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary)
            ) {
                Text(text = stringResource(id = R.string.create_account))
            }

            TextButton(
                onClick = navigateToAccount,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .height(48.dp)
                    .fillMaxWidth(),
                shape = MaterialTheme.shapes.medium,
            ) {
                Text(
                    text = stringResource(id = R.string.log_in),
                    color = MaterialTheme.colors.secondary
                )
            }
        }
    }
}
