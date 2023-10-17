FROM python:3.8

WORKDIR /flask_redis_app

COPY requirements.txt /flask_redis_app

RUN pip3 install -r requirements.txt

COPY . /flask_redis_app

CMD python app.py