Feature: Login feature file

Scenario: Positive Login scenario
Given Launch browser
When Hit the URL
And Click on Login icon
And User needs to provide credentials as "Jit" and "Roy"
Then Successful Login message would appear

Scenario: Negative Login scenario2
Given Launch browser
When Hit the URL

And Click on Login icon
And User needs to provide credentials as "Jit1" and "Roy1"
Then Failure Login message would appear

Scenario Outline: Negative Login scenario3
Given Launch browser
When Hit the URL
And Click on Login icon
And User needs to provide credentials as "<id>" and "<pwd>"
Then Failure Login message would appear
Examples: 
			|id|pwd|
			|Jitoption1|Royoption1|
			|Jitoption2|Royoption2|
			|Jitoption3|Royoption3|