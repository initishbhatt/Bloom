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
package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class GardenModel(
    val name: String,
    @DrawableRes val imageRes: Int
)

val desertChic =
    GardenModel("Desert Chic", R.drawable.desert_chic)

val tinyTerrariums = GardenModel(
    "Tiny Terrariums",
    R.drawable.tiny_terrariums
)

val jungleVibes = GardenModel(
    "Jungle Vibes",
    R.drawable.jungle_vibes
)

val easyCare = GardenModel(
    "Easy Care",
    R.drawable.easy_care
)
val statements =
    GardenModel("Statements", R.drawable.statements)

val monstera =
    GardenModel("Monstera", R.drawable.monstera)

val aglaonema = GardenModel(
    "Aglaonema",
    R.drawable.aglaonema
)
val peaceLily = GardenModel(
    "Peace Lily",
    R.drawable.peace_lily
)
val fiddleLeaf = GardenModel(
    "Fiddle Leaf",
    R.drawable.fiddle_leaf
)
val snakePlant = GardenModel(
    "Snake Plant",
    R.drawable.snake_plant
)
val porthos = GardenModel("Porthos", R.drawable.porthos)

val gardenList = listOf(
    tinyTerrariums, jungleVibes, easyCare, statements, monstera,
    aglaonema, peaceLily, fiddleLeaf, statements, snakePlant, porthos, desertChic
)
