Feature: Corporate car rental

  @CCR
  Scenario Outline: corporate car rental page
    Given URl opened with CCR
    Then click on corporate car rental on CCR
    Then Enter valid "<name>" and "<companyname>" and "<email>" and "<phno>" and click submit and if submit deatil is verified redirect to home page
 

   Examples: 
      | name     | companyname   |email                     |phno           |
      | Sunitha   | mindtree      |suni1902@gmail.com  |8919129906    |
 
