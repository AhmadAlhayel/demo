SpringBoot Webbtjänst med CI/CD Pipeline
=========================================

Det här projektet är en SpringBoot-applikation som fungerar som en webbtjänst och kan ta emot förfrågningar och skicka tillbaka svar med ett enkelt meddelande som svarsbody.

Funktioner
----------

- SpringBoot-applikation som fungerar som en webbtjänst.
- GitHub Actions för kontinuerlig integration/kontinuerlig leverans (CI/CD).
- Dockeriserad applikation för enkel distribution.
- Automatisk distribution till AWS EC2 efter att en ny version har pushats till GitHub.

Förutsättningar
---------------

- Java Development Kit (JDK) 19 eller senare
- Maven
- Docker
- GitHub-konto
- Docker Hub-konto
- AWS-konto med EC2-åtkomst

Komma igång
-----------

1. **Klona Repository**

    ```bash
    git clone <repository_url>
    cd <repository_name>
    ```

2. **Bygg Projektet**

    ```bash
    mvn clean install -DskipTests
    ```

3. **Konfigurera Docker Hub-legitimation**

    Ange ditt Docker Hub-användarnamn och lösenord som hemligheter i ditt GitHub-repositorium. Ersätt `<ditt_användarnamn>` och `<ditt_lösenord>` med dina faktiska uppgifter.

    ```bash
    $ echo "DOCKER_USERNAME=<ditt_användarnamn>" >> .env
    $ echo "DOCKER_PASSWORD=<ditt_lösenord>" >> .env
    ```

4. **GitHub Actions**

    GitHub Actions är konfigurerade för att automatiskt bygga och pusha Docker-bilder till Docker Hub vid varje push till repositoryt.

5. **AWS-distribution**

    CI/CD-pipelinen är konfigurerad för att distribuera applikationen till en AWS EC2-instans efter en lyckad byggprocess. Docker-bilden hämtas från Docker Hub och den nya containern distribueras till EC2-instansen.

Arbetsflöde
-----------

1. Pusha ändringar till GitHub-repositorium.
2. GitHub Actions utlöses av push-händelsen.
3. Byggprocessen körs och skapar en Docker-bild.
4. Docker-bilden pushas till Docker Hub.
5. Distributionsjobbet utlöses vid lyckad byggning.
6. Docker-bilden hämtas från Docker Hub till AWS EC2-instansen.
7. Den gamla containern raderas, och en ny container startas med den uppdaterade bilden.
8. Applikationen är nu uppdaterad och driftsatt på AWS.

Filstruktur
-----------

- `src/`: Innehåller källkoden till SpringBoot-applikationen.
- `Dockerfile`: Definierar Docker-bilden för applikationen.
- `.github/workflows/main.yml`: GitHub Actions-arbetsflödesfil för CI/CD.
- `README.md`: Denna fil.

Författare
----------

- [Ditt Namn]

Licens
------

Det här projektet licensieras under [Licensnamn] - se [LICENSE](LICENSE)-filen för detaljer.
