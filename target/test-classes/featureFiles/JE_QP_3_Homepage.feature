Feature: HOMEPAGE

  @TC_01
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click GL Code setup button in homepage
    And Check landing page to GL Code setup page or not
    Then close the Homepage Page
    
    @TC_02
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click Ignored Trip setup button in homepage
    And Check landing page to Ignored Trip setup page or not
    Then close the Homepage Page
    
    @TC_03
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click NS FOS File upload button in homepage
    And Check landing page NS FOS File upload page or not
    Then close the Homepage Page
    
    @TC_04
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click NS Audit report button in homepage
    And Check landing page NS Audit report page or not
    Then close the Homepage Page
    
    @TC_05
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click NS Verify trips button in homepage
    And Check landing page NS Verify trips page or not
    Then close the Homepage Page
    
    @TC_06
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click NS upload button in homepage
    And Check landing page NS upload page or not
    Then close the Homepage Page
    
    @TC_07
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click NS FOS File upload button in top of homepage
    And Check landing page NS FOS File upload page or not
    Then close the Homepage Page
    
    @TC_08
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in error tab
    And Check NS Status should show error option or not
    Then close the Homepage Page
    
    @TC_09
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in Good to Go tab
    And Check NS Status should show Ready to Go option or not
    Then close the Homepage Page
    
    @TC_10
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in Verified tab
    And Check NS Status should show Verified option or not
    Then close the Homepage Page
    
    @TC_11
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in NS Pending tab
    And Check NS Status should show NS Pending option or not
    Then close the Homepage Page
    
    @TC_12
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in Not Ready in FOS tab
    And Check Trip Status should show No Quote option or not
    Then close the Homepage Page
    
    @TC_13
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in GL Code Pending Item Code tab
    And Check Entry Status should show Pending option or not
    Then close the Homepage Page
    
    @TC_14
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click view trips button in Ignored tab
    And Check Trip Status should show Ignored option or not
    Then close the Homepage Page
    
    @TC_15
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click valid date in NS Uploaded On
    And Click back button in NS Uploaded Log
    Then close the Homepage Page
    
     
    @TC_16
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click view trips 1.0 button
    Then check the page landed to view trips 1.0 or not
    Then close the Homepage Page
     
    @TC_17
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click non inventory line item  button
    #Then check the page landed to non inventory line item  or not
    Then close the Homepage Page
     
    @TC_18
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click GL Code setup button
    Then check the page landed to GL Code setup or not
    Then close the Homepage Page
     
    @TC_19
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click Company GL setup button
    Then check the page landed to Company GL setup or not
    Then close the Homepage Page
     
    @TC_20
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click Company setup button
    Then check the page landed to Company setup or not
    Then close the Homepage Page
     
    @TC_21
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click Global config setup button
    Then check the page landed to Global config setup or not
    Then close the Homepage Page
     
    @TC_22
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click upload FOS Report 1.0  button
    Then check the page landed to upload FOS Report 1.0  or not
    Then close the Homepage Page
     
    @TC_23
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click user icon button
    And Click close button in user icon
    Then close the Homepage Page
     
    @TC_24
  Scenario: Homepage:Valid Check
    Given To Check Homepage User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/NSINVOICEDEMO/login.aspx"
    When To Check Homepage User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Homepage
    Then Click menu icon button in Homepage
    And Click close button in menu bar
    Then close the Homepage Page