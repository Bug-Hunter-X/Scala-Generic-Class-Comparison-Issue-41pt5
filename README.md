# Scala Generic Class Comparison Issue

This example highlights a subtle issue related to type erasure in Scala when comparing instances of generic classes.  While the code might appear to work correctly for simple cases, it can lead to unexpected behavior with different type parameters.  The key is that Scala's type parameters are erased at runtime, so direct comparison of generic instances will be affected.

## Problem
The `MyClass` attempts to compare instances based on their `value`. The issue occurs because the type parameter `T` gets erased at runtime. The compilation will work fine and may seem correct in some cases. However, subtle bugs may arise when used for instances with different type parameters but the same runtime value, as `Any` values will lead to `false` comparison results.

## Solution
The solution avoids direct comparison of generic instances. Instead, it uses a `equals` method comparison or other pattern matching approaches, depending on the needs.

