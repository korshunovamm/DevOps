## Запуск

```docker build --tag flask_app . ```

```docker run -d -p 5000:5000 flask_app``` 

Приложение по ссылке http://localhost:5000/

## Скачать образ из docker-registry

```docker pull docker.io/mmkorshunova/flask_app:flask_app```

```docker run -d -p 5000:5000 --name my_app docker.io/mmkorshunova/flask_app:flask_app```
