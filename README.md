# 2024-10-Selenium-WebDriverManager

This project is a Java-based application that utilizes Selenium WebDriver for browser automation. It is built using
Maven for dependency management and project structure.

## Prerequisites

- Java 17
- Maven 3.6.3 or higher

## Getting Started

To get started with this project, clone the repository and navigate to the project directory:

```sh
git clone <repository-url>
cd 2024-10-Selenium-WebDriverManager
```

## Building the Project

To build the project, run the following Maven command:

```sh
mvn clean install
```

## Running Tests

To run the tests, use the following Maven command:

```sh
mvn test
```

## Maven Dependencies

The project uses the following Maven dependencies:

```xml

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.26.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-manager</artifactId>
        <version>4.26.0</version>
    </dependency>
    <!-- Uncomment the following dependency if you want to use WebDriverManager -->
    <!--
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.9.2</version>
    </dependency>
    -->
</dependencies>
```

## License

This project is licensed under the Apache License, Version 2.0. See
the [LICENSE](http://www.apache.org/licenses/LICENSE-2.0.txt) file for details.

## Contributors

- Simon Stewart
- Alexei Barantsev
- Diego Molina
- Jim Evans
- David Burns
- Titus Fortner

## Additional Resources

- [Selenium Documentation](https://selenium.dev/documentation/)
- [Maven Documentation](https://maven.apache.org/guides/index.html)