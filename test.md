
# GET /api/mentor/mentee

| Test Case ID | Test Scenario                                       | Preconditions      | Test Steps                                   | Expected Result                                                   |
| ------------ | --------------------------------------------------- | ------------------ | -------------------------------------------- | ----------------------------------------------------------------- |
| TC_01        | Verify mentor can view all assigned mentees         | Mentor logged in   | 1. Send request `GET /api/mentor/mentee`     | API returns list of mentees                                       |
| TC_02        | Verify response when mentor has no assigned mentees | Mentor logged in   | 1. Send request `GET /api/mentor/mentee`     | API returns empty list                                            |
| TC_03        | Verify API authorization                            | User not logged in | 1. Send request without authentication token | System returns **401 Unauthorized**                               |
| TC_04        | Verify response structure                           | Mentor logged in   | 1. Call API                                  | Response contains **student name, skill level, technology track** |
| TC_05        | Verify API response performance                     | Mentor logged in   | 1. Call API                                  | API responds within acceptable time (<2 seconds)                  |


# GET /api/mentor/mentee/students-name

| Test Case ID | Test Scenario                            | Preconditions      | Test Steps                                                       | Expected Result                     |
| ------------ | ---------------------------------------- | ------------------ | ---------------------------------------------------------------- | ----------------------------------- |
| TC_06        | Verify mentor can search student by name | Mentor logged in   | 1. Send request `GET /api/mentor/mentee/students-name?name=John` | API returns matching student list   |
| TC_07        | Verify search using partial name         | Mentor logged in   | 1. Call API with partial name                                    | Matching students returned          |
| TC_08        | Verify search with non-existing student  | Mentor logged in   | 1. Call API with random name                                     | API returns empty list              |
| TC_09        | Verify search parameter validation       | Mentor logged in   | 1. Call API without name parameter                               | System returns validation error     |
| TC_10        | Verify authorization for search API      | User not logged in | 1. Call API without token                                        | System returns **401 Unauthorized** |

# GET /api/mentor/mentees?technology={tech}

| Test Case ID | Test Scenario                                  | Preconditions      | Test Steps                                        | Expected Result                     |
| ------------ | ---------------------------------------------- | ------------------ | ------------------------------------------------- | ----------------------------------- |
| TC_11        | Verify mentor can filter mentees by technology | Mentor logged in   | 1. Call `GET /api/mentor/mentees?technology=node` | API returns only Node students      |
| TC_12        | Verify filter using different technology       | Mentor logged in   | 1. Call API with `technology=react`               | System returns React students       |
| TC_13        | Verify filter with invalid technology          | Mentor logged in   | 1. Call API with unsupported technology           | API returns empty list              |
| TC_14        | Verify missing technology parameter            | Mentor logged in   | 1. Call `/api/mentor/mentees` without parameter   | System returns validation error     |
| TC_15        | Verify API authorization                       | User not logged in | 1. Call API without token                         | System returns **401 Unauthorized** |


# POST /api/mentor/mentee

| Test Case ID | Test Scenario                         | Preconditions      | Test Steps                                       | Expected Result                     |
| ------------ | ------------------------------------- | ------------------ | ------------------------------------------------ | ----------------------------------- |
| TC_16        | Verify mentor can add new mentee      | Mentor logged in   | 1. Send `POST /api/mentor/mentee` with studentId | Student added successfully          |
| TC_17        | Verify adding duplicate mentee        | Mentor logged in   | 1. Send POST request with existing studentId     | System returns duplicate error      |
| TC_18        | Verify request with invalid studentId | Mentor logged in   | 1. Send POST request with invalid studentId      | System returns validation error     |
| TC_19        | Verify authorization for add mentee   | User not logged in | 1. Send POST request without token               | System returns **401 Unauthorized** |


# DELETE /api/mentor/mentee/{studentId}
| Test Case ID | Test Scenario                                  | Preconditions      | Test Steps                                      | Expected Result                     |
| ------------ | ---------------------------------------------- | ------------------ | ----------------------------------------------- | ----------------------------------- |
| TC_20        | Verify mentor can remove existing mentee       | Mentor logged in   | 1. Send `DELETE /api/mentor/mentee/{studentId}` | Student removed successfully        |
| TC_21        | Verify removing non-existing student           | Mentor logged in   | 1. Send DELETE with invalid studentId           | System returns error                |
| TC_22        | Verify removing student not assigned to mentor | Mentor logged in   | 1. Send DELETE for another mentor's student     | System returns **403 Forbidden**    |
| TC_23        | Verify authorization for delete API            | User not logged in | 1. Send DELETE without token                    | System returns **401 Unauthorized** |


# GET /api/mentor/mentee/student-profile

| Test Case ID | Test Scenario                                 | Preconditions      | Test Steps                                       | Expected Result                                                                    |
| ------------ | --------------------------------------------- | ------------------ | ------------------------------------------------ | ---------------------------------------------------------------------------------- |
| TC_24        | Verify mentor can view student profile        | Mentor logged in   | 1. Send `GET /api/mentor/mentee/student-profile` | API returns student profile                                                        |
| TC_25        | Verify profile contains required fields       | Mentor logged in   | 1. Call API                                      | Response contains **name, technology track, learning path, projects, skill level** |
| TC_26        | Verify profile request with invalid studentId | Mentor logged in   | 1. Call API with incorrect ID                    | System returns error message                                                       |
| TC_27        | Verify authorization for profile API          | User not logged in | 1. Call API without token                        | System returns **401 Unauthorized**                                                |
