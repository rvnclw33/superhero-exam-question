# EXAM: Superhero Assignment

## Assignment
In this assignment, you must work with superheroes. The `superheroes.Superhero` record class represents a superhero, and it has the following components:

* name: `String`
* aliases: `List<String>`, may be null
* alignment: `superheroes.Superhero.Alignment` (`BAD`, `GOOD`, or `NEUTRAL`)
* durability: `int`
* intelligence: `int`
* power: `int`
* strength: `int`
* speed: `int`
* gender: `superheroes.Superhero.Gender` (`FEMALE` or `MALE`), may be null
* publisher: `String`
* firstAppearance: `String`, may be null

Under the `src/main/resources/superheroes` directory, you can find a binary file named `superheroes.ser`. It contains a list of 547 `Superhero` objects written into the file with object serialization.
The `superheroes.SuperheroManager` interface provides support to work with `Superhero` objects. Its default method `getSuperheroes()` returns the list. The interface contains five abstract interface methods.

## Preparations
Building the project requires JDK 25. All Git operations must be executed in your directory that contains the project's `pom.xml` file.

Create an empty Git repository by executing the command:
`git init`

Configure Git properly, setting the `user.name` and the `user.email` options in the repository with:
`git config --local user.name "your_full_name"`
`git config --local user.email "your_email"`
(To prove your identity, you must provide your full official name, in the same form as also shown in Neptun).

Import the directory of the project into the Git repository by executing:
`git add .`
`git commit -m "initial import"`

## Interface Implementation
Your job is to create a class named `SuperheroManagerImpl` in the `superheroes` package that implements the interface.

First, implement the interface with the Implement Methods feature of IntelliJ IDEA. This will create stubs for the interface methods.

In the `SuperheroManagerImpl` class, add a `main` method. In the first line of the `main` method, declare a local variable whose value is a reference to an instance of the class:
`var manager = new SuperheroManagerImpl();`

Git operation: Add the `SuperheroManagerImpl` class with the method stubs and the main method to the repository in a commit whose message is:
`feat: add SuperheroManagerImpl class with method stubs`

In the `SuperheroManagerImpl` class, you must implement each abstract interface method. The bodies of the methods must contain only a single stream pipeline; nothing else is allowed! An interface method whose body contains anything other than a stream pipeline is rejected.

To demonstrate the use of the interface, you must call all five abstract methods of the interface on the instance in the `main` method. If a method returns a value, it must be printed to the console.

Git operation: Commit the changes with the message:
`fix: implement interface methods in SuperheroManagerImpl`

## Adding Dependencies to the Project
Git operation: In the repository, create a branch named `jspecify` and switch to it. The remaining changes must happen on the `jspecify` branch.
`git checkout -b jspecify`

In the `pom.xml` file, add the following dependency to the project:
`org.jspecify:jspecify:1.0.0` with scope `compile`.

Important: After adding the dependencies, right-click `pom.xml` on the Project tab, then choose Sync Project from the Maven submenu.

Git operation: Commit the changes with the message:
`build: add JSpecify dependency to pom.xml`

Now, make the following changes to the code. First, annotate the package declaration of the `package-info.java` file as follows:
`@org.jspecify.annotations.NullMarked`
`package superheroes;`

Then, add the following import to the `Superhero` record class:
`import org.jspecify.annotations.Nullable;`

Finally, mark `Superhero` record components that allow null with `@Nullable`: `@Nullable List<String> aliases`, `@Nullable Gender gender`, and `@Nullable String firstAppearance`.

Git operation: Commit the changes with the message:
`feat: add JSpecify annotations`

## Submitting Your Work
You must submit your project's working directory as a ZIP archive that also contains your Git repository, i.e., the `.git` folder.
