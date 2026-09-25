package com.example.setupapplication.textcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun LazyColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)

        ) {
            items(5) { index ->
                Box(
                    modifier = Modifier
                        .background(color = Color.DarkGray)
                        .size(100.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Item : ${index}"
                    )
                }
            }
        }

        // Lazy Row
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            items(5) { index ->
                Box(
                    modifier = Modifier
                        .background(color = Color.DarkGray)
                        .size(100.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Item : ${index}"
                    )
                }
            }
        }

        // different items example
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            // type 2
            item {
                Text(
                    text = "Only single Item"
                )
            }

            // type 3
            val names = listOf<String> ("Aman","Bidhe","Champa","Dhiraj","Elijah")
            items(names){name ->
                Text(
                    text = name
                )
            }

            //type 4
            itemsIndexed(names){index, name ->
             // always pass index first then name
                Text(
                    text = "${index} ${name}"
                )
            }

        }
    }

}

@Composable
fun NestedExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)

        ) {
        items(10) { row ->
            Text(
                text = "Row: ${row}"
            )
            // nesting
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                items(15) { itemNo ->
                    Box(
                        modifier = Modifier.size(100.dp).background(color = Color.DarkGray,
                            shape = RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Item : ${itemNo}"
                        )
                    }
                }
            }
        }
    }
}