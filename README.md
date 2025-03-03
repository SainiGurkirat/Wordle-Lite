# WordleLite Project

## Project Overview

In this assignment, you will work in groups of 2-3 to complete a simplified version of the popular word-guessing game Wordle. The starting code provides the structure and some completed methods, but you need to implement the missing functionality.

### Game Rules

- The computer will randomly select a word from a predefined list
- You have 6 attempts to guess the word
- After each guess, you receive feedback:
  - `*` means a letter is correct and in the right position
  - `+` means a letter is in the word but in the wrong position
  - `-` means a letter is not in the word

## Task Instructions

### Step 1: Form Your Group (2-3 students)

Decide who will work on which methods. Each member should be responsible for at least one method:

1. `playGame(String secretWord)` - Manages the main game loop
2. `getPlayerGuess()` - Gets and validates the player's guess
3. `provideFeedback(String guess, String secretWord)` - Compares the guess with the secret word
4. `displayFeedback(String guess, String feedback)` - Shows the results of each guess
5. `isGameWon(String feedback)` - Checks if the player has guessed correctly

### Step 2: Clone and Open the Repository in Codespaces

1. One team member should share the repository link with the group
2. Each member should:
   - Click on the repository link
   - Click the green "Code" button
   - Select the "Codespaces" tab
   - Click "Create codespace on main"

### Step 3: Implement Your Assigned Method(s)

Work individually to implement your assigned method(s). Here's what each method should do:

#### `playGame(String secretWord)`
- Create a loop that runs for MAX_ATTEMPTS or until the game is won
- Get the player's guess using `getPlayerGuess()`
- Get feedback using `provideFeedback()`
- Display the feedback using `displayFeedback()`
- Check if the game is won using `isGameWon()`
- Display appropriate messages for win/loss conditions

#### `getPlayerGuess()`
- Prompt the user to enter a 4-letter word
- Read input using the scanner
- Validate that the input is 4 letters long
- If invalid, ask again
- Return the valid guess

#### `provideFeedback(String guess, String secretWord)`
- Create a feedback string with *, +, or - for each letter
- * for correct letter in correct position
- + for correct letter in wrong position
- - for letter not in the word
- Handle cases where a letter appears multiple times

#### `displayFeedback(String guess, String feedback)`
- Print the guess and the feedback in a readable format

#### `isGameWon(String feedback)`
- Check if all characters in the feedback are '*'
- Return true if the game is won, false otherwise

### Step 4: Test Your Implementation

Test your code to make sure it works correctly before pushing your changes.

## Using Git in Codespaces

### Committing Your Changes

1. After implementing your method, click on the "Source Control" icon in the left sidebar (it looks like a branch)
2. You'll see your changed files listed
3. Hover over your file and click the "+" to stage the changes
4. Enter a descriptive commit message in the text box at the top (e.g., "Implemented getPlayerGuess method")
5. Click the checkmark (✓) above the message box to commit

### Pushing Your Changes

1. After committing, click the "..." (ellipsis) menu in the Source Control panel
2. Select "Push"
3. If prompted, enter your GitHub credentials

### Pulling Changes from Teammates

1. When your teammates have pushed their changes, click the "..." menu in the Source Control panel
2. Select "Pull"
3. This will update your code with their changes

### Resolving Conflicts

If you and a teammate edit the same file, you might encounter conflicts:

1. Click on the conflicted file to open it
2. Look for sections marked with `<<<<<<< HEAD`, `=======`, and `>>>>>>> [commit hash]`
3. Edit the file to resolve the conflict (choose which version to keep or merge them)
4. Save the file
5. Stage the resolved file
6. Commit the changes

## Submission

Once all team members have completed their methods and pushed their changes, test the complete program to ensure it works correctly. Your final submission will be the completed repository with contributions from all team members.

## Tips

- Communicate with your teammates about your progress
- Test your method thoroughly before committing
- Use descriptive commit messages
- Pull changes frequently to stay up-to-date
- Ask for help if you get stuck!

Good luck and have fun building WordleLite!