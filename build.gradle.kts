// TODO: 等待 https://youtrack.jetbrains.com/issue/KTIJ-19369 修复将被移除
@file:Suppress("DSL_SCOPE_VIOLATION")
buildscript {

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply(false)
    alias(libs.plugins.android.library) apply(false)
    alias(libs.plugins.kotlin.android) apply(false)
}