(ns material.util
  (:require [javelin.core :as j
                          :refer        [cell]
                          :refer-macros [cell=]]))

(defn ^:private normalize-classes
  [classes]
  (if (map? classes)
    classes
    (let [->map #(zipmap % (repeat true))] 
      (->map (if (string? classes)
               (.split classes #"\s+")
               (seq classes))))))

(defn assoc-class
  [attrs & [prepend append]]
  (let [classes (:class attrs)]
    (assoc attrs :class
           (cell= (merge (normalize-classes prepend)
                         (normalize-classes classes)
                         (normalize-classes append))))))

