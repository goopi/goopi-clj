(ns goopi.views.layout
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5)]))

(defn common [title & body]
  (html5
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
      [:meta {:name "viewport" :content "width=device-width,initial-scale=1,maximum-scale=1"}]
      [:title title]
      [:style "body{font-family:Palatino,serif;font-size:1em;font-weight:300;margin:0.5em;padding:0}p{line-height:1.6em;margin:0.5em 0;max-width:50em}a{color:#D95B43}a:visited{color:#BD1550}li{margin-bottom:0.3em}"]]
    [:body
      [:div {:id "main" :class "container"} body]]))

(defn index []
  (common "Gustavo Leguizamon (@goopi)"
    [:p "Hi! I'm Gustavo Leguizamon. I live in "
      [:a {:target "_blank" :href "https://maps.google.com.ar/maps?q=Mar+del+Plata,+Buenos+Aires,+Argentina&hl=es&sll=-34.605096,-58.436279&sspn=0.094666,0.181789&hnear=Mar+del+Plata,+Buenos+Aires&t=m&z=11"}
        "Mar del Plata, Argentina"]
      ". I write code for "
      [:a {:target "_blank" :href "http://github.com/goopi"} "fun"]
      " and "
      [:a {:target "_blank" :href "http://www.irbislab.com/"} "profit"]
      ", mostly in JavaScript, Objective-C and Python. I’m a big fan "
      "of functional programming, Lisp, Clojure, Haskell, etc."
      "<br>Some times I "
      [:a {:target "_blank" :href "http://twitter.com/goopi"} "tweet"]
      "."]
    [:p "Here's a short list of the latest projects I've been working on:"]
    [:ul
      [:li "Watch - Find the movies you want to watch."]
      [:li "Coolibri - Brings your tweets to life."]]
    [:p "Powered by "
      [:a {:target "_blank" :href "http://clojure.org/"} "clojure"]
      " and "
      [:a {:target "_blank" :href "http://en.wikipedia.org/wiki/Mate_(beverage)"} "mate"]
      "."]))

(defn four-oh-four []
  (common "D'oh!" [:img {:src "/images/doh.jpg"}]))
