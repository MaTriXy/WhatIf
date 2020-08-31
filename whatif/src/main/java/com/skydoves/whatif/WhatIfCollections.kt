/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.whatif

/** An expression for invoking [whatIf] when the [List] is not null and not empty. */
@WhatIfInlineOnly
public inline fun <T> List<T>?.whatIfNotNullOrEmpty(
  whatIf: (List<T>) -> Unit
) {

  this.whatIfNotNullOrEmpty(
    whatIf = { whatIf(it) },
    whatIfNot = { }
  )
}

/**
 * An expression for invoking [whatIf] when the [List] is not null and not empty.
 * If the array is null or empty, [whatIfNot] will be invoked instead of the [whatIf].
 */
@WhatIfInlineOnly
public inline fun <T> List<T>?.whatIfNotNullOrEmpty(
  whatIf: (List<T>) -> Unit,
  whatIfNot: () -> Unit
) {

  if (!this.isNullOrEmpty()) {
    whatIf(this)
  } else {
    whatIfNot()
  }
}

/** An expression for invoking [whatIf] when the [Set] is not null and not empty. */
@WhatIfInlineOnly
public inline fun <T> Set<T>?.whatIfNotNullOrEmpty(
  whatIf: (Set<T>) -> Unit
) {

  this.whatIfNotNullOrEmpty(
    whatIf = { whatIf(it) },
    whatIfNot = { }
  )
}

/**
 * An expression for invoking [whatIf] when the [Set] is not null and not empty.
 * If the array is null or empty, [whatIfNot] will be invoked instead of the [whatIf].
 */
@WhatIfInlineOnly
public inline fun <T> Set<T>?.whatIfNotNullOrEmpty(
  whatIf: (Set<T>) -> Unit,
  whatIfNot: () -> Unit
) {

  if (!this.isNullOrEmpty()) {
    whatIf(this)
  } else {
    whatIfNot()
  }
}

/** An expression for invoking [whatIf] when the [Map] is not null and not empty. */
@WhatIfInlineOnly
public inline fun <T, R> Map<T, R>?.whatIfNotNullOrEmpty(
  whatIf: (Map<T, R>) -> Unit
) {

  this.whatIfNotNullOrEmpty(
    whatIf = { whatIf(it) },
    whatIfNot = { }
  )
}

/**
 * An expression for invoking [whatIf] when the [Map] is not null and not empty.
 * If the array is null or empty, [whatIfNot] will be invoked instead of the [whatIf].
 */
@WhatIfInlineOnly
public inline fun <T, R> Map<T, R>?.whatIfNotNullOrEmpty(
  whatIf: (Map<T, R>) -> Unit,
  whatIfNot: () -> Unit
) {

  if (!this.isNullOrEmpty()) {
    whatIf(this)
  } else {
    whatIfNot()
  }
}
