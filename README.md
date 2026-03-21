# 🎮 Java String Exercises

## 🟢 Exercise 1 — Mario Inventory

You receive a string representing Mario's collected items:

"Mario:coin,coin,mushroom,coin,star"

Your task:
- Count how many times each item appears
- Return a structure like:

coin → 3  
mushroom → 1  
star → 1

---

## 🟡 Exercise 2 — Gran Turismo Leaderboard

You receive a leaderboard string:

"player1:120,player2:300,player3:250"

Your task:
- Parse the string
- Find the player with the highest score
- Return the player name and score

---

## 🔵 Exercise 3 — Donkey Kong Compression

You receive a string:

"aaabbbcc"

Your task:
- Compress the string using character frequency
- Output:

"a3b3c2"

---

## 🔴 Exercise 4 — Validate Game Command (Cheat Code)

You receive a command string:

"UP UP DOWN DOWN LEFT RIGHT LEFT RIGHT B A"

Your task:
- Validate if the sequence matches a predefined cheat code
- Return true or false

---

## 🟣 Exercise 5 — PS5 Log Parser (Interview Level)

You receive a log string:

"[ERROR] Game: GT7 - Crash at lap 3"

Your task:
- Extract:
    - level → ERROR
    - game → GT7
    - message → Crash at lap 3

---

## 🔥 Bonus Challenge (Optional)

Combine everything:

Input:

"Player:GabsK8 | Game:GT7 | Scores:120,300,250 | Status:WIN"

Your task:
- Extract player name
- Extract game name
- Find highest score
- Normalize player name (lowercase + trim)