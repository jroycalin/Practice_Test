Feature: Login feature file

Background:
Given Launch browser

Scenario: Form fillup scenario

When Hit the URL
And Click on Login icon
And User needs to provide credentials as below
			|id|pwd|
			|Jitoption1|Royoption1|
			|Jitoption2|Royoption2|
			|Jitoption3|Royoption3|
Then Successful Login message would appear

