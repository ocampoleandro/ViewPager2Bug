# ViewPager2Bug
repo to give an example to reproduce an issue with viewPager2: https://issuetracker.google.com/issues/138734786

## Files
Inside res, there are two layouts that can be used inside CardAdapter: item_card and item_card_rel.
The first one uses ConstraintLayout and is the one who has the issue described in the issuetracker.
The second one uses a RelativeLayout and behaves without problem.

## Additional comments
When using item_card, if we change in the viewPager2 the value of the attribute "layout_width" to match_parent, then the issue does not happen.
