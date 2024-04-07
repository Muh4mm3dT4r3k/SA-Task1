const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
const apiPort = 6002;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(cors());
app.use(bodyParser.json());

app.get("/", (req, res) => {
  res.send("Hello World! - from nodejs count letters service!");
});

app.post("/api/countletters", (req, res) => {
  function countLetters(paragraph) {
    return paragraph.length;
  }

  let result = countLetters(req?.body?.paragraph);
  return res.status(200).json({
    success: true,
    value: `${result}`,
  });
});

app.listen(apiPort, () => console.log(`Server running on port ${apiPort}`));
