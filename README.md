# kbc_game
Backend Flow Explanation
Starting the Game: When the backend starts (KbcGameApplication.java), it will serve the game on http://localhost:8080.

Fetching Questions:

When the frontend sends a request to /game/question/{index}, the backend will respond with the question and its options.
The backend gets the correct question from the list using the index provided in the URL.
Submitting Answers:

When a player submits an answer through the form, the frontend makes a POST request to /game/submit, passing the selected answer, the question index, and the player name.
The backend checks if the answer matches the correct one.
If the answer is correct, the player receives a congratulatory message. Otherwise, they get a message stating their answer is wrong.

Final Steps to Run the Backend
Run the Spring Boot Application:

Use an IDE like IntelliJ IDEA or Eclipse.
Right-click KbcGameApplication.java and choose "Run."
Ensure Maven Dependencies:

Make sure Maven has downloaded the necessary dependencies (like Spring Boot and ZXing for QR code generation) as defined in pom.xml.
Test the Endpoints:

You can use Postman or a browser to access the game endpoints:
Questions: GET http://localhost:8080/game/question/{index}
Submit Answer: POST http://localhost:8080/game/submit?answer={A/B/C/D}&questionIndex={index}&playerName={name}

With this backend setup, you have a fully functioning server that handles KBC-style questions, validates answers, and communicates with the frontend.
