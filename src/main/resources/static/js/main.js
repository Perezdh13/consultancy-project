function confirmDelete() {
  if (confirm("¿Estás seguro de que deseas eliminar este elemento?")) {
    return true;
  } else {
    return false;
  }
}