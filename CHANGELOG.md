Change Log
===============================================================================

Version 1.0.5 (2014-04-24)
----------------------------

 * Fixed OnScrollListener issue after updating contents #100
 * Fixed LayoutParams casting issue when recycling state #102
 * Fixed the onClick item id #86
 * Fixed bug that the default case on Touch event #67
 * Fixed for "NPE onSizeChanged" #41 PR #91
 * Added guard against issue #45
 * Fixed setAdapter bug #86 #85
 * Using newest build tools and libraries - #78 #96

Version 1.0.4 (2014-02-22)
----------------------------

 * Added column_count attribute #32
 * Added setColumnCount() methods to support dynamically changing columns #26
 * Added empty view support to ExtendableListView #33
 * Fixed grid_paddingTop and paddingTop being ignored #20
 * Fixed ArrayIndexOutOfBoundsException fix #52
 * Fixed Unintentional onClick event on scroll down #42
 * Fixed onScrollStateChanged never get called #18
 * Fixed notifyDataSetChanged sync bug when mFirstPosition = 0 #22

Version 1.0.3 (2014-01-06)
----------------------------

 * Bug fixes #19 & #27

Version 1.0.2 (2014-01-02)
----------------------------

 * Reverted targetSdkVersion for backwards compatibility

Version 1.0.1 (2013-12-31)
----------------------------

 * Added - initial support for OnItemClickListener #14
 * Fix - measurement of root with wrap content height #16
 * Fix - high velocity fling bug #11

Version 1.0.0 (2013-12-28)
----------------------------

 * Initial version available via Maven Central