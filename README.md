# Unexpected Behavior of removeIf with Mutable Collections in Kotlin

This repository demonstrates a subtle issue with Kotlin's `removeIf` function when applied to mutable collections. The `removeIf` function modifies the collection in place, which can lead to unexpected behavior if not handled carefully.

The `bug.kt` file showcases the unexpected behavior with `MutableList`, `MutableSet`, and `MutableMap`. The `bugSolution.kt` file provides a safer alternative, demonstrating how to iterate and remove elements without potential issues.