Feature: Form fill up in sample website "https://demo.automationtesting.in/Register.html"
Scenario: Positive scenario

Given The system property and browser driver driver is setup properly
When Open the URL "https://demo.automationtesting.in/Register.html"
And Enter first name "Jit"
And Enter Last name "Roy"
And Enter Address as "Kolkata"
And Enter email "jroycaliasn@gmail.com"
And Enter phone "7033462523"
And Select gender as "Male" 
And Select hobbies as "Movies" 
And Choose language "Engish" from dropdown
And Choose Skills "Java" from dropdown
And Choose select country "India" from dropdown
And Choose date of birth as "25" then "June" and "1994"

Then Print success message