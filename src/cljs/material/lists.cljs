(ns material.lists
  (:require [hoplon.core   :as hl
                           :refer        [div hi li span ul]
                           :refer-macros [defelem]]
            [material.util :refer        [assoc-class]]))

(defelem divider
  [attributes children]
  (let [attrs (assoc attributes :role "separator")]
    (li (assoc-class attrs "mdc-list-divider")
        children)))

(defelem group
  [attributes children]
  (div (assoc-class attributes "mdc-list-group")
       children))

(defelem group-subheader
  [attributes children]
  (h3 (assoc-class attributes "mdc-list-group__subheader")
       children))

(defelem item
  [attributes children]
  (li (assoc-class attributes "mdc-list-item")
      children))

(defelem item-text
  [attributes children]
  (span (assoc-class attributes "mdc-list-item__text")
        children))

(defelem item-text-primary
  [attributes children]
  (span (assoc-class attributes "mdc-list-item__primary-text")
        children))

(defelem item-text-secondary
  [attributes children]
  (span (assoc-class attributes "mdc-list-item__secondary-text")
        children))

(defelem list
  [attributes children]
  (let [attrs (assoc attributes :aria-orientation "vertical")]
    (ul (assoc-class attrs "mdc-list")
        children)))
