package com.codenytra.amme.noterex

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codenytra.amme.noterex.ui.theme.NoteRexTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    val notes = listOf(
        Note(
            title = "Shopping List",
            content = "Milk\nBread\nEggs\nCoffee",
            color = Color(0xFFFFF8B8)
        ),
        Note(
            title = "Android Project",
            content = "Finish the NoteRex home screen\n• Navigation\n• Top bar\n• Search",
            color = Color(0xFFD7F9E9)
        ),
        Note(
            title = "Ideas 💡",
            content = "Build a simple productivity app with notes, folders and projects.",
            color = Color(0xFFE8DDFD)
        ),
        Note(
            title = "Books to Read",
            content = "• Clean Architecture\n• Kotlin in Action  \n• Kotlin in Action \n• Kotlin in Action \n• Kotlin in Action \n• Kotlin in Action \n• Kotlin in Action\n• Kotlin in Action\n• Kotlin in Action\n• Kotlin in Action\n• Designing Data-Intensive Applications",
            color = Color(0xFFE1F0CB)
        ),
        Note(
            title = "Important",
            content = "Don't forget to push the latest changes to GitHub.",
            color = Color(0xFFFFDAD6)
        ),
        Note(
            title = "Workout",
            content = "Monday — Chest\nWednesday — Back\nFriday — Legs",
            color = Color(0xFFDDEBFF)
        ),
        Note(
            title = "Meeting",
            content = "Discuss the new project structure and API integration.",
            color = Color(0xFFFFE4C4)
        ),
        Note(
            title = "Quick Note",
            content = "Remember this idea!",
            color = Color(0xFFF5D6E6)
        )
    )

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalItemSpacing = 12.dp
    ) {
        items(notes) { note ->
            NoteCard(note)
        }
    }
}

data class Note(
    val title: String,
    val content: String,
    val color: Color
)

@Composable
private fun NoteCard(
    note: Note,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = note.color
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = note.title,
                style = TextStyle(
                    color = Color(0xFF121212),
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                ),
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = note.content,
                style = TextStyle(
                    color = Color(0xFF121212),
                    fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                ),
                maxLines = 10,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    NoteRexTheme {
        HomeScreen()
    }
}