
# Oauth

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | Access token grants authorisation to school data (currently valid for a period of 1 day) |  [optional]
**refreshToken** | **String** | Refresh tokens should be used to aquire a new access token upon expiry of access tokens |  [optional]
**tokenType** | **String** | Provides the client with the information to utilise the access token to make a resource request |  [optional]
**level** | **String** | Details whether the token gives access to application level resources or school data. |  [optional]
**expiresIn** | **Integer** | The amount of time (in seconds) that the access token is valid for |  [optional]
**schoolId** | **Integer** | Internal Platform ID for school that the token applies to |  [optional]



