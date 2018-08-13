(ns material.card
  (:require [hoplon.core  :as hl
                          :refer        [button div i]
                          :refer-macros [defelem]]
            [javelin.core :as j
                          :refer        [cell]
                          :refer-macros [cell=]]))

(defn ^:private normalize-class
  [kvs]
  (if (map? kvs)
    kvs
    (let [->map #(zipmap % (repeat true))] 
      (->map (if (string? kvs)
               (.split kvs #"\s+")
               (seq kvs))))))

(defn ^:private assoc-class
  [attrs & [prepend append]]
  (let [classes (:class attrs)]
    (assoc attrs :class
           (cell= (merge (normalize-class prepend)
                         (normalize-class classes)
                         (normalize-class append))))))

(defelem card
  [attributes children]
  (div (assoc-class attributes "mdc-card")
       children))

(defelem media
  [attributes children]
  (div (assoc-class attributes "mdc-card__media")
       children))

(defelem media-wide
  [attributes children]
  (media (assoc-class attributes [] "mdc-card__media--16-9")
         children))

(defelem content
  [attributes children]
  (div (assoc-class attributes "mdc-card__media-content")
    children))

(defelem actions
  [attributes children]
  (div (assoc-class attributes "mdc-card__actions")
    children))

(defelem actions-wide
  [attributes children]
  (actions (assoc-class attributes [] "mdc-card__actions--full-bleed")))

(defelem action-buttons
  [attributes children]
  (div (assoc-class attributes "mdc-card__action-buttons")
    children))

(defelem action-button
  [attributes children]
  (button (assoc-class attributes "mdc-button mdc-card__action mdc-card__action--button")
          children))

(defelem action-icons
  [attributes children]
  (div (assoc-class  attributes "mdc-card__action-icons")
    children))

(defelem action-icon
  [attributes children]
  (i (assoc-class attributes "material-icons mdc-icon-button mdc-card__action mdc-card__action--icon")
    children))
