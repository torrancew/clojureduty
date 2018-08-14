(ns material.cards
  (:require [hoplon.core   :as hl
                           :refer        [button div i]
                           :refer-macros [defelem]]
            [material.util :refer        [assoc-class]]))

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
  (media (assoc-class attributes "mdc-card__media--16-9")
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
  (actions (assoc-class attributes "mdc-card__actions--full-bleed")))

(defelem action-buttons
  [attributes children]
  (div (assoc-class attributes "mdc-card__action-buttons")
       children))

(defelem action-button
  [attributes children]
  (button (assoc-class attributes ["mdc-button" "mdc-card__action" "mdc-card__action--button"])
          children))

(defelem action-icons
  [attributes children]
  (div (assoc-class  attributes "mdc-card__action-icons")
       children))

(defelem action-icon
  [attributes children]
  (button (assoc-class attributes ["material-icons" "mdc-icon-button" "mdc-card__action" "mdc-card__action--icon"])
          children))
