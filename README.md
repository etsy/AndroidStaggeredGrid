
AndroidStaggeredGrid
=====================


##Notice - Deprecated - 09-2015

This library has been deprecated. We will no longer be shipping any updates or approving community pull requests for this project.

While the code will remain for anyone who wishes to use it, we suggest you prefer using Google's own [`RecyclerView `](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html) with their [`StaggeredGridLayoutManager`](https://developer.android.com/reference/android/support/v7/widget/StaggeredGridLayoutManager.html). We are doing the same internally at Etsy.

Thanks to everyone who used the library and submitted code or issues to improve it.

##About

An Android staggered grid view which supports multiple columns with rows of varying sizes.

The `StaggeredGridView` was developed due to requirements for the Etsy app not met by any existing Android libraries.
Namely a stable implementation with the ability to have a different number of columns in landscape & portrait,
to sync grid position across orientation changes and support for headers & footers.

![Staggered Grid Sample Image][1]

##Features

 * Configurable column count for portrait and landscape orientations.
 * Sync'd row position across orientation changes.
 * Configurable item margin.
 * Support for headers & footers.
 * Internal padding that does not affect the header & footer.
 * Extends [`AbsListView`](http://developer.android.com/reference/android/widget/AbsListView.html) - "mostly"
 * Supports [`AbsListView.OnScrollListener`](http://developer.android.com/reference/android/widget/AbsListView.OnScrollListener.html)

##Setup

The library was built for and tested on Android version 2.3.3(SDK 10) and above. It could be modified to support older versions if required.

The simplest way to use AndroidStaggeredGrid is to add the library as a gradle aar dependency to your build. See the [CHANGELOG.md](https://github.com/etsy/AndroidStaggeredGrid/blob/master/CHANGELOG.md) for the latest version number.

```
repositories {
    mavenCentral()
}

dependencies {
    compile 'com.etsy.android.grid:library:x.x.x' // see changelog
}
```

Alternatively import the `/library` project into your Android Studio project and add it as a dependency in your `build.gradle`.

The library is currently configured to be built via Gradle only. It has the following dependencies:

 * Android Gradle plugin v0.9.2 - `com.android.tools.build:gradle:0.9.2`
 * Android Support Library v19.1 - `com.android.support:support-v4:19.1.+`

Still use Eclipse/building with Ant? You can still use AndroidStaggeredGrid, it's just a few extra steps (left up to the reader).

##Usage

*Please see the `/sample` app for a more detailed code example of how to use the library.*

1. Add the `StaggeredGridView` to the layout you want to show.
    ```xml

        <com.etsy.android.grid.StaggeredGridView
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:id="@+id/grid_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:item_margin="8dp"
            app:column_count="@integer/column_count" />
    ```
2. Configure attributes.
 * `item_margin` - The margin around each grid item (default 0dp).
 * `column_count` - The number of columns displayed. Will override column_count_portrait and column_count_landscape if present (default 0)
 * `column_count_portrait` - The number of columns displayed when the grid is in portrait (default 2).
 * `column_count_landscape` - The number of columns displayed when the grid is in landscape (default 3).
 * `grid_paddingLeft` - Padding to the left of the grid. Does not apply to headers and footers (default 0).
 * `grid_paddingRight` - Padding to the right of the grid. Does not apply to headers and footers (default 0).
 * `grid_paddingTop` - Padding to the top of the grid. Does not apply to headers and footers (default 0).
 * `grid_paddingBottom` - Padding to the bottom of the grid. Does not apply to headers and footers (default 0).
3. Setup an adapter just like you would with a `GridView`/`ListView`.
    ```java
    ListAdapter adapter = ...;

    StaggeredGridView gridView = (StaggeredGridView) findViewById(R.id.grid_view);

    gridView.setAdapter(adapter);
    ```
**NOTE:**
As column widths change on orientation change, the grid view expects that all children
maintain their own width to height ratio. To assist with this the project includes the
`DynamicHeightImageView` as an example of a view that measures its height based on its width.

##TODO

The `StaggeredGridView` does not support the following:

 * Item selector drawables
 * Item long press event
 * Scroll bars
 * Row dividers
 * Edge effect
 * Fading edge
 * Overscroll

##License

    Copyright (c) 2013 Etsy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: http://f.cl.ly/items/2z1B0Y0M0G0O2k1l3J03/Trending.png
