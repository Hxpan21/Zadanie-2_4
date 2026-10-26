# Imported Java/Maven project

## Run on Replit

This project is a Java console application. Its entry point is
`src/main/java/Main.java`, which prints a greeting and then exits.

- Run the configured `Start application` workflow to execute it.
- Click **Run** and view the greeting in the Console. The workflow finishes
  normally after printing `Hello world gs JPWP2!`; no web preview is expected.
- Build and test manually with `mvn test`.
- Run the entry point directly with `javac -d . src/main/java/Main.java && java -cp . Main`.

Java and Maven are provided by the Java module in `.replit`; `replit.nix`
does not need duplicate Java packages. No secrets or external services are
required. Maven currently builds successfully but reports no tests to run.
