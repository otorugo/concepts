package com.example.concepts.recycler

import com.example.concepts.recycler.models.Live

class MockedDataSource {
    companion object {

        fun createDataSet(): ArrayList<Live> {
            val list = ArrayList<Live>()

            list.add(
                Live(
                    title = "Espumas ao Vento",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/sBy-eClpxwU/mqdefault_6s.webp?du=3000&sqp=CP6b95wG&rs=AOn4CLC694wUkr2iXKX94kYgzyKWm6M6sw",
                    link = "https://www.youtube.com/watch?v=sBy-eClpxwU"
                    )
            )
            list.add(
                Live(
                    title = "Qui nem jiló",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/GgaDgsZQ7NU/mqdefault_6s.webp?du=3000&sqp=CLyi95wG&rs=AOn4CLAHv1WVRTD1SgDOil0IN1JA1lqS0g",
                    link = "https://www.youtube.com/watch?v=GgaDgsZQ7NU"
                )
            )

            list.add(
                Live(
                    title = "Preciso do seu sorriso",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/oHu954dgpKE/mqdefault_6s.webp?du=3000&sqp=CJq595wG&rs=AOn4CLAYgSJr43LDQhJ4U6BJwqkzoiZ6Jw",
                    link = "https://www.youtube.com/watch?v=oHu954dgpKE"
                )
            )


            list.add(
                Live(
                    title = "Espumas ao Vento",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/sBy-eClpxwU/mqdefault_6s.webp?du=3000&sqp=CP6b95wG&rs=AOn4CLC694wUkr2iXKX94kYgzyKWm6M6sw",
                    link = "https://www.youtube.com/watch?v=sBy-eClpxwU"
                )
            )
            list.add(
                Live(
                    title = "Qui nem jiló",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/GgaDgsZQ7NU/mqdefault_6s.webp?du=3000&sqp=CLyi95wG&rs=AOn4CLAHv1WVRTD1SgDOil0IN1JA1lqS0g",
                    link = "https://www.youtube.com/watch?v=GgaDgsZQ7NU"
                )
            )

            list.add(
                Live(
                    title = "Preciso do seu sorriso",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/oHu954dgpKE/mqdefault_6s.webp?du=3000&sqp=CJq595wG&rs=AOn4CLAYgSJr43LDQhJ4U6BJwqkzoiZ6Jw",
                    link = "https://www.youtube.com/watch?v=oHu954dgpKE"
                )
            )


            list.add(
                Live(
                    title = "Espumas ao Vento",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/sBy-eClpxwU/mqdefault_6s.webp?du=3000&sqp=CP6b95wG&rs=AOn4CLC694wUkr2iXKX94kYgzyKWm6M6sw",
                    link = "https://www.youtube.com/watch?v=sBy-eClpxwU"
                )
            )
            list.add(
                Live(
                    title = "Qui nem jiló",
                    author = "Victor Hugo",
                    thumbURL = "https://i.ytimg.com/an_webp/GgaDgsZQ7NU/mqdefault_6s.webp?du=3000&sqp=CLyi95wG&rs=AOn4CLAHv1WVRTD1SgDOil0IN1JA1lqS0g",
                    link = "https://www.youtube.com/watch?v=GgaDgsZQ7NU"
                )
            )

            return list
        }

    }
}