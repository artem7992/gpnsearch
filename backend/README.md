# gpnsearch
Поисковый сервис для GPN Tech.Challenge

### Запуск приложения
Для запуска использовать следующие команды:
````
mvn clean install
./run.sh
````

### Запуск индексации компаний
- Скачать jmxterm с сайта https://docs.cyclopsgroup.org/jmxterm
- Запустить jmx метод индексации компаний:
````
java -jar jmxterm-1.0.2-uber.jar
open localhost:6001
bean gpnsearch:service=company
run indexCompanies
````