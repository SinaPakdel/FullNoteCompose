package com.sina.fullnotecompose.data.model

import androidx.compose.ui.graphics.Color
import com.sina.fullnotecompose.ui.theme.HighPriorityColor
import com.sina.fullnotecompose.ui.theme.LowPriorityColor
import com.sina.fullnotecompose.ui.theme.MediumPriorityColor
import com.sina.fullnotecompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}