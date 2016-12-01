Scenario: Add user(positive)

Given user is on the contact grid page
When user click on "+" button
Then contact edit page is open
When enter information to corresponding fields $name, $lastName, $twitter, $skype, $imgUrl, $notes
And click "SAVE"
Then popup message $message appeared
When entering $name to search field
Then the user with $name $isPresent on the page 

Example:

|name|lastName|twitter|skype|imgUrl|notes|message|isPeresent
|Janifer|Ivanova|twitter.com/id11111|panas|http://3.bp.blogspot.com/-XJZO-IUsduQ/U3OfFg9NqpI/AAAAAAAAWys/1MRlS2Yosvk/s1600/ISABEL-SPEARMINT.jpg|Hi my little pony|Contact saved!|is|
|Archibalt|Pupkin|twitter.com/id22222|http://img14.deviantart.net/0fa3/i/2012/243/1/f/male_stock_by_vishstudio-d5d1yf6.jpg|Will get you beck soon||Contact saved!|is|

Scenario: Add user(negative)

Given user is on the contact grid page
When user click on "+" button
Then contact edit page is open
When enter only $name to the corresponding text field
Then "SAVE" button is not clickable
When enter only $lastName to the corresponding text field
Then "SAVE" button is not clickable
When leave all fields empty
Then "SAVE" button is not clickable

Example:

|name|
|name1|
|name2|

Scenario: Add group(positive)

Given user is on the group grid page
When user click on "+" button
Then group edit popup page is open
When enter $groupName ti the text field
And click "SAVE" button
Then popup message $popupMessage appeared
When entering $groupName to the search field
Then the group with $groupName $isGroupPresent on the page

Example:

|groupName|popupMessage|isGroupPresrnt|
|Group1|Group created!|is|
|Group2|Group created!|is|
|Group1|Group created!|is not|

Scenario: Add group(negative)

Given user is on the group grid page
When user click on "+" button
Then group edit popup page is open
When leave name field empty
Then "SAVE" button is not clickable
