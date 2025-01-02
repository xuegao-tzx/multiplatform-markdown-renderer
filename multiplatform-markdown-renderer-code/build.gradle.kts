plugins {
    id("com.mikepenz.android.library")
    id("com.mikepenz.kotlin.multiplatform")
    id("com.mikepenz.compose")
    id("com.mikepenz.publishing")
}

android {
    namespace = "com.mikepenz.markdown.code"
}

dependencies {
    commonMainApi(projects.multiplatformMarkdownRenderer)
    commonMainCompileOnly(compose.runtime)
    commonMainCompileOnly(compose.ui)
    commonMainCompileOnly(compose.foundation)

    commonMainApi(libs.highlights)
}