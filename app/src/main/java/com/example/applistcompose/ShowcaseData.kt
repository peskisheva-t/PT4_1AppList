package com.example.applistcompose

// Модель для витрины. НЕ дублирует AppItem — это отдельный класс.
data class ShowcaseApp(
    val id: Int,
    val name: String,
    val description: String,
    val category: String
)

object ShowcaseData {
    val apps = listOf(
        ShowcaseApp(101, "VK Музыка", "Музыка и подкасты", "Музыка"),
        ShowcaseApp(102, "VK Видео", "Видео и трансляции", "Видео"),
        ShowcaseApp(103, "VK Мессенджер", "Общение без границ", "Общение"),
        ShowcaseApp(104, "Почта Mail.ru", "Почта и облако", "Работа"),
        ShowcaseApp(105, "Облако Mail.ru", "Файлы в облаке", "Работа"),
        ShowcaseApp(106, "VK Знакомства", "Поиск новых знакомств", "Общение"),
        ShowcaseApp(107, "VK Клипы", "Короткие видео", "Развлечения"),
        ShowcaseApp(108, "VK Play", "Игры и киберспорт", "Игры"),
        ShowcaseApp(109, "VK Маркет", "Покупки и объявления", "Покупки")
    )

    // 3 страницы по 3 приложения
    val pages: List<List<ShowcaseApp>> = apps.chunked(3)
}

// Маппер: ShowcaseApp -> AppItem, чтобы переиспользовать AppCard(app: AppItem)
fun ShowcaseApp.toAppItem(): AppItem = AppItem(
    id = id,
    name = name,
    description = description,
    category = category
)