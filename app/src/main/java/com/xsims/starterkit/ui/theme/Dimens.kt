package com.xsims.starterkit.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Contains padding values based on Material 2:
 *  - [none][Dimens.none] : 0dp
 *  - [verySmall][Dimens.verySmall] : 4dp
 *  - [small][Dimens.small] : 8dp
 *  - [medium][Dimens.medium] : 16dp
 *  - [large][Dimens.large] : 24dp
 *  - [veryLarge][Dimens.veryLarge] : 36dp
 *
 *  **See Also:** [Material Spacing methods](https://m2.material.io/design/layout/spacing-methods.html)
 */
@Immutable
class Dimens(
    /** 0dp */
    val none: Dp = 0.dp,
    /** 4dp */
    val verySmall: Dp = 4.dp,
    /** 8dp */
    val small: Dp = 8.dp,
    /** 16dp */
    val medium: Dp = 16.dp,
    /** 24dp */
    val large: Dp = 24.dp,
    /** 36dp */
    val veryLarge: Dp = 36.dp
)

/**
 * Contains padding values based on Material 2:
 *  - [none][Dimens.none] : 0dp
 *  - [verySmall][Dimens.verySmall] : 4dp
 *  - [small][Dimens.small] : 8dp
 *  - [medium][Dimens.medium] : 16dp
 *  - [large][Dimens.large] : 24dp
 *  - [veryLarge][Dimens.veryLarge] : 36dp
 *
 *  **See Also:** [Material Spacing methods](https://m2.material.io/design/layout/spacing-methods.html)
 */
@Suppress("unused")
val MaterialTheme.dimens: Dimens
    get() = Dimens()