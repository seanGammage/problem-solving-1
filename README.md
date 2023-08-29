# problem-solving-1

## Commonly Used Git Commands
- `git clone` -  Creates a copy of a remote repository onto your local machine. This command downloads the entire repository's history and files.
- `git status` - Displays the status of your working directory and staging area, indicating which files have been modified, added, or deleted.
- `git fetch` - ownloads new changes from a remote repository without automatically merging them into your current branch
- `git pull` - Fetches and integrates changes from a remote repository into your local branch. It's a combination of git fetch and git merge.
- `git push` - Uploads local commits to a remote repository, updating its history with the changes you've made on your local branch.
- `git add` - Stages changes in specified file(s) to be committed. This means the changes are ready to be included in the next commit.
- `git commit -m "<insert commit message here>"` - Records the staged changes as a new commit in the repository's history, along with a brief description of the changes provided in the commit message.
- `git checkout <branch name>` - Switches to an existing branch specified by branch_name, updating your working directory and files to match that branch's state.
- `git stash` - Temporarily saves your uncommitted changes in a "stash," allowing you to switch branches or perform other operations without committing the changes. Stashing is useful when you're not ready to commit but need to work on a different task or branch.
- `git stash pop` - Retrieves the most recent stash and applies it to your working directory. It also removes the stash from the stash list. This command is handy when you're ready to continue working on the changes you stashed.
- `git merge <branch name>` - Integrates changes from the specified branch into the currently checked-out branch. It combines the changes and creates a new commit if necessary.
- `git branch` -  Lists all local branches in the repository. The currently active branch is marked with an asterisk.

## Quiz

### Running Tests
 - In terminal, cd into the `quiz` directory. Run the command to run all unittests `mvn test`.
- You can "comment out" tests if you do not with to run all of them
- Alternitavely, there are mvn commands to run just specific tests. I will let you google to find those commands. Google is your friend

### Directions

1. Find your name next to one of the below problems. You are to solve the problem. Unittests have already been created that call the functions you will create with specific arguments in the parameter, and an expected output. See problems 1 and 2 for examples (we did these in class).
2. Create a branch. The branch name should be short, and indicative of your task at hand
3. Find your assigned Unittest in `quiz/src/test/java/com/problem_solver/quiz/ProblemSolvingTest.java`. It will be calling a function that does not exist yet `ProblemSolving.<test_name>()`. You need to create this function in `quiz/src/main/java/com/problem_solver/quiz/ProblemSolving.java`. The unittest calls your function
with specific arguments, and has a specific expected output. The method you create will satisfy the expected output. See problems 1 and 2 for examples.
4. Run the tests. See the "Running Tests" section above.
5. Once you have successfully run the tests, its time to push up the code to your branch via `git add`, then `git commit -m "<commit message>`, then `git push`. Make sure you are only pushing to the branch you created. Use google to see how to `git add` more than one file at a time.
6. Once your code is pushed up, create a `pull request` (also known as `merge reqeust`) in GitHub. Add a good descrion to the pull request.
7. I will review it, and possibly leave you feedback.

### Problems

1. Sum of Array Elements
  i.Calculate and return the sum of all elements in an array.

2. Even Numbers between 1 and 20
  i. Generate and return a string containing even numbers between 1 and 20.

3. Prime Number Check
  i. Determine whether a given number is prime or not.

4. Factorial Calculation
  i. Calculate and return the factorial of a given number.

5. Fibonacci Sequence
  i. Generate and return the first n elements of the Fibonacci sequence.

6. `[Robert]` Maximum Element in an Array
  i. Find and return the maximum element in an array of integers.

7. `[Mustafa]` Reversing an Array
  i. Reverse the elements of an array and return the reversed array.

8. Palindrome Array Check
  i. Check whether an array is a palindrome (reads the same forwards and backwards).

9. `[Fardeen]` Smallest Element in an Array
  i. Find and return the smallest element in an array of integers.

10. Sum of Even and Product of Odd Numbers in an Array
  i. Calculate and return the sum of even numbers and the product of odd numbers in an array.