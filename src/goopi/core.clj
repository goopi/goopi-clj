(ns goopi.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring])
  (:require [compojure.route :as route]
            [goopi.views.layout :as layout]))

(defroutes routes
  (GET "/" [] (layout/index))
  (route/resources "/")
  (route/not-found (layout/four-oh-four)))

(defn start [port]
  (run-jetty routes {:port port :join? false}))

(defn -main [& port]
  (let [port (Integer/parseInt (or port "5000"))]
    (start port)))
