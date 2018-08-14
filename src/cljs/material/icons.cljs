(ns material.icons
  (:require [hoplon.core  :as hl
                          :refer [link]]))

(def include
  (partial link :href "https://fonts.googleapis.com/icon?family=Material+Icons" :rel "stylesheet"))
