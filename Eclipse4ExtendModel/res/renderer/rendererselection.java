
else if (uiElement instanceof MPart) {
			if (contributedPartRenderer == null) {
				contributedPartRenderer = new ContributedPartRenderer();
				initRenderer(contributedPartRenderer);
			}
			return contributedPartRenderer;
		}