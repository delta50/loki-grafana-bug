FROM grafana/grafana:6.7.3

COPY grafana.ini /etc/grafana/grafana.ini
COPY datasource.yaml /etc/grafana/provisioning/datasources/datasource.yaml

ENTRYPOINT /run.sh

EXPOSE 3000:3000

