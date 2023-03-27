# ADR

## 1: Aiming for Microkernel Architecture

### Status: Accepted
### Context:
We start with a basic function of drawing on a blank plane and add other functionalities, like networking or other drawing-tools
### Decision:
Basic functions:
* Draw on a white Plane with one color
* UI
Plugins:
* Saving function
* different drawing tools (different colors, brushes)
* cooperative drawing / networking
* export/import of picture files
